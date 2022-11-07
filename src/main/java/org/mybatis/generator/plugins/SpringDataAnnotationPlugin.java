package org.mybatis.generator.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class SpringDataAnnotationPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        addTableAnnotation(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(
            TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        addTableAnnotation(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                       IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        if (introspectedTable.hasPrimaryKeyColumns()) {
            for (IntrospectedColumn primaryKeyColumn : introspectedTable.getPrimaryKeyColumns()) {
                if (introspectedColumn.getActualColumnName().equals(primaryKeyColumn.getActualColumnName())) {
                    topLevelClass.addImportedType(
                            new FullyQualifiedJavaType("org.springframework.data.annotation.Id")); //$NON-NLS-1$
                    field.addAnnotation("@Id");
                }
            }
        }

        topLevelClass.addImportedType(
                new FullyQualifiedJavaType("org.springframework.data.relational.core.mapping.Column")); //$NON-NLS-1$
        field.addAnnotation(String.format("@Column(\"%s\")", introspectedColumn.getActualColumnName()));

        return true;
    }

    protected void addTableAnnotation(TopLevelClass topLevelClass,
                                      IntrospectedTable introspectedTable) {
        topLevelClass.addImportedType(
                new FullyQualifiedJavaType("org.springframework.data.relational.core.mapping.Table")); //$NON-NLS-1$
        topLevelClass.addAnnotation(String.format("@Table(\"%s\")", introspectedTable.getFullyQualifiedTableNameAtRuntime()));
    }
}
