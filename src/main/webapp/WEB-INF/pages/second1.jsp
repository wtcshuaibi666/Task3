<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/2
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:object name="data">
        <json:property name="id" value="${second.id}"/>
        <json:property name="sname" value="${second.sname}"/>
        <json:property name="first_id" value="${second.first_id}"/>
        <json:property name="status" value="${second.status}"/>
        <json:property name="create_at" value="${second.create_at}"/>
        <json:property name="update_at" value="${second.update_at}"/>
        <json:property name="update_by" value="${second.update_by}"/>
        <json:property name="work_id" value="${second.work_id}"/>
    </json:object>
</json:object>