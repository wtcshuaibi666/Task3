<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/2
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="msg" value="${msg}"/>
    <json:array name="data" items="${bannerList}" var="banner">
        <json:object>
            <json:property name="id" value="${banner.id}"/>
            <json:property name="tupian" value="${banner.tupian}"/>
            <json:property name="update_by" value="${banner.update_by}"/>
            <json:property name="url" value="${banner.url}"/>
            <json:property name="status" value="${banner.status}"/>
            <json:property name="create_at" value="${banner.create_at}"/>
            <json:property name="update_at" value="${banner.update_at}"/>
        </json:object>
    </json:array>
</json:object>