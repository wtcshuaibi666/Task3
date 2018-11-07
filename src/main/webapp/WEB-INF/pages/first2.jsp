<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/2
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="data" items="${firstList}" var="first">
        <json:object>
            <json:property name="id" value="${first.id}"/>
            <json:property name="fname" value="${first.fname}"/>
            <json:property name="status" value="${first.status}"/>
            <json:property name="update_by" value="${first.update_by}"/>
            <json:property name="create_at" value="${first.create_at}"/>
            <json:property name="update_at" value="${first.update_at}"/>
            <json:property name="second_id" value="${first.second_id}"/>
        </json:object>
    </json:array>
</json:object>