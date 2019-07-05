package com.github.salesforce.marketingcloud.javasdk;

import com.github.salesforce.marketingcloud.javasdk.auth.Authentication;
import com.squareup.okhttp.*;
import org.threeten.bp.format.DateTimeFormatter;

import javax.net.ssl.KeyManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IApiClient {
    String getBasePath();

    ApiClient setBasePath(String basePath);

    OkHttpClient getHttpClient();

    ApiClient setHttpClient(OkHttpClient httpClient);

    JSON getJSON();

    ApiClient setJSON(JSON json);

    boolean isVerifyingSsl();

    ApiClient setVerifyingSsl(boolean verifyingSsl);

    InputStream getSslCaCert();

    ApiClient setSslCaCert(InputStream sslCaCert);

    KeyManager[] getKeyManagers();

    ApiClient setKeyManagers(KeyManager[] managers);

    DateFormat getDateFormat();

    ApiClient setDateFormat(DateFormat dateFormat);

    ApiClient setSqlDateFormat(DateFormat dateFormat);

    ApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat);

    ApiClient setLocalDateFormat(DateTimeFormatter dateFormat);

    ApiClient setLenientOnJson(boolean lenientOnJson);

    Map<String, Authentication> getAuthentications();

    Authentication getAuthentication(String authName);

    void setUsername(String username);

    void setPassword(String password);

    void setApiKey(String apiKey);

    void setApiKeyPrefix(String apiKeyPrefix);

    void setAccessToken(String accessToken);

    ApiClient setUserAgent(String userAgent);

    ApiClient addDefaultHeader(String key, String value);

    boolean isDebugging();

    ApiClient setDebugging(boolean debugging);

    String getTempFolderPath();

    ApiClient setTempFolderPath(String tempFolderPath);

    int getConnectTimeout();

    ApiClient setConnectTimeout(int connectionTimeout);

    int getReadTimeout();

    ApiClient setReadTimeout(int readTimeout);

    int getWriteTimeout();

    ApiClient setWriteTimeout(int writeTimeout);

    String parameterToString(Object param);

    List<Pair> parameterToPair(String name, Object value);

    List<Pair> parameterToPairs(String collectionFormat, String name, Collection value);

    String sanitizeFilename(String filename);

    boolean isJsonMime(String mime);

    String selectHeaderAccept(String[] accepts);

    String selectHeaderContentType(String[] contentTypes);

    String escapeString(String str);

    @SuppressWarnings("unchecked")
    <T> T deserialize(Response response, Type returnType) throws ApiException;

    RequestBody serialize(Object obj, String contentType) throws ApiException;

    File downloadFileFromResponse(Response response) throws ApiException;

    File prepareDownloadFile(Response response) throws IOException;

    <T> ApiResponse<T> execute(Call call) throws ApiException;

    <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException;

    <T> void executeAsync(Call call, ApiCallback<T> callback);

    @SuppressWarnings("unchecked")
    <T> void executeAsync(Call call, Type returnType, ApiCallback<T> callback);

    <T> T handleResponse(Response response, Type returnType) throws ApiException;

    Call buildCall(String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String[] authNames, ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException;

    Request buildRequest(String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String[] authNames, ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException;

    String buildUrl(String path, List<Pair> queryParams, List<Pair> collectionQueryParams);

    void processHeaderParams(Map<String, String> headerParams, Request.Builder reqBuilder);

    void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams);

    RequestBody buildRequestBodyFormEncoding(Map<String, Object> formParams);

    RequestBody buildRequestBodyMultipart(Map<String, Object> formParams);

    String guessContentTypeFromFile(File file);
}
