package my.function

import my.pojo.*

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger
import com.amazonaws.services.lambda.runtime.RequestHandler

import com.google.gson.Gson
import com.google.gson.GsonBuilder

class MyLambdaFunction implements RequestHandler<LambdaProxyRequest, LambdaProxyResponse> {

    private LambdaLogger logger

    private Gson gson = new GsonBuilder().setPrettyPrinting().create()

    @Override
    LambdaProxyResponse handleRequest(LambdaProxyRequest request, Context context) {

        logger = context.getLogger()
        logger.log("Routing success - executing handleRequest...")

        RequestBody requestBody = request.getBody()

        Integer id = requestBody.getId()
        String date = requestBody.getDate()
        String url = requestBody.getUrl()

        if(id == null || date == null || url == null){
            logger.log("Item id, URL or date missing, request: " + request.getBody().dump())
            return new LambdaProxyResponse(400, gson.toJson(new ResponseBody(0, "Bad request.")))
        }

        Integer httpResponseCode
        ResponseBody responseBody

        try{
		/**
		 * My code here
		 */
        }
        catch(Exception e){
            logger.log("Error in requestHandler method: ${e}")

            responseBody = new ResponseBody(0, "Error processing.")
            httpResponseCode = 500
        }

        return new LambdaProxyResponse(httpResponseCode, gson.toJson(responseBody))
    }
}
