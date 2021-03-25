package my.pojo

import groovy.transform.Canonical

@Canonical
class LambdaProxyResponse {
    private Boolean isBase64Encoded;
    private Integer statusCode;
    private HashMap<String, Object> headers;
    private HashMap<String, Object> multiValueHeaders;
    private String body;

    /**
     * @link https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-integration-settings-integration-response.html
     */
    LambdaProxyResponse(Boolean isBase64Encoded, Integer statusCode, HashMap<String, Object> headers, HashMap<String, Object> multiValueHeaders, String body) {
        this.isBase64Encoded = isBase64Encoded
        this.statusCode = statusCode
        this.headers = headers
        this.multiValueHeaders = multiValueHeaders
        this.body = body
    }

    LambdaProxyResponse(Integer statusCode, String body) {
        this.statusCode = statusCode
        this.body = body
        this.isBase64Encoded = false
        this.headers = new HashMap<>()
        this.multiValueHeaders = new HashMap<>()
    }

    LambdaProxyResponse() {

    }

    void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode
    }

    void setBody(String body) {
        this.body = body
    }

    void setIsBase64Encoded(Boolean isBase64Encoded) {
        this.isBase64Encoded = isBase64Encoded
    }

    void setHeaders(HashMap<String, Object> headers) {
        this.headers = headers
    }

    void setMultiValueHeaders(HashMap<String, Object> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders
    }

    Boolean getIsBase64Encoded() {
        return isBase64Encoded
    }

    HashMap<String, Object> getHeaders() {
        return headers
    }

    HashMap<String, Object> getMultiValueHeaders() {
        return multiValueHeaders
    }

    Integer getStatusCode() {
        return statusCode
    }

    String getBody() {
        return body
    }
}