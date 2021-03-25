package my.pojo

import com.amazonaws.services.lambda.runtime.Context

import com.google.gson.GsonBuilder
import com.google.gson.Gson

import groovy.transform.Canonical

@Canonical
class LambdaProxyRequest {

    private String resource;
    private String path;
    private String httpMethod;
    private Map<String, String> headers;
    private Map<String, String> queryStringParameters;
    private Map<String, String> pathParameters;
    private Map<String, String> stageVariables;
    private Context context;
    private String body;
    private Boolean isBase64Encoded;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create()

    LambdaProxyRequest(String resource, String path, String httpMethod, Map<String, String> headers, Map<String, String> queryStringParameters, Map<String, String> pathParameters, Map<String, String> stageVariables, Context context, String body, Boolean isBase64Encoded) {
        this.resource = resource
        this.path = path
        this.httpMethod = httpMethod
        this.headers = headers
        this.queryStringParameters = queryStringParameters
        this.pathParameters = pathParameters
        this.stageVariables = stageVariables
        this.context = context
        this.body = body
        this.isBase64Encoded = isBase64Encoded
    }

    String getResource() {
        return resource
    }

    String getPath() {
        return path
    }

    String getHttpMethod() {
        return httpMethod
    }

    Map<String, String> getHeaders() {
        return headers
    }

    Map<String, String> getQueryStringParameters() {
        return queryStringParameters
    }

    Map<String, String> getPathParameters() {
        return pathParameters
    }

    Map<String, String> getStageVariables() {
        return stageVariables
    }

    Context getContext() {
        return context
    }

    RequestBody getBody() {
        return gson.fromJson(body, RequestBody.class)
    }

    Boolean getIsBase64Encoded() {
        return isBase64Encoded
    }

    void setResource(String resource) {
        this.resource = resource
    }

    void setPath(String path) {
        this.path = path
    }

    void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod
    }

    void setHeaders(Map<String, String> headers) {
        this.headers = headers
    }

    void setQueryStringParameters(Map<String, String> queryStringParameters) {
        this.queryStringParameters = queryStringParameters
    }

    void setPathParameters(Map<String, String> pathParameters) {
        this.pathParameters = pathParameters
    }

    void setStageVariables(Map<String, String> stageVariables) {
        this.stageVariables = stageVariables
    }

    void setContext(Context context) {
        this.context = context
    }

    void setBody(String body) {
        this.body = body
    }

    void setIsBase64Encoded(Boolean isBase64Encoded) {
        this.isBase64Encoded = isBase64Encoded
    }

    LambdaProxyRequest(){

    }
}