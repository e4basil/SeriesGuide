/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-11-22 19:59:01 UTC)
 * on 2013-12-07 at 10:28:18 UTC 
 * Modify at your own risk.
 */

package com.uwetrottmann.seriesguide.shows;

/**
 * Service definition for Shows (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ShowsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Shows extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.17.0-rc of the shows library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://optical-hexagon-364.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "shows/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Shows(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Shows(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "get".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link Get#execute()} method to invoke the remote operation.
   *
   * @param tvdbid
   * @return the request
   */
  public Get get(java.lang.Integer tvdbid) throws java.io.IOException {
    Get result = new Get(tvdbid);
    initialize(result);
    return result;
  }

  public class Get extends ShowsRequest<com.uwetrottmann.seriesguide.shows.model.Show> {

    private static final String REST_PATH = "get/{tvdbid}";

    /**
     * Create a request for the method "get".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
     * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param tvdbid
     * @since 1.13
     */
    protected Get(java.lang.Integer tvdbid) {
      super(Shows.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.shows.model.Show.class);
      this.tvdbid = com.google.api.client.util.Preconditions.checkNotNull(tvdbid, "Required parameter tvdbid must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Get setAlt(java.lang.String alt) {
      return (Get) super.setAlt(alt);
    }

    @Override
    public Get setFields(java.lang.String fields) {
      return (Get) super.setFields(fields);
    }

    @Override
    public Get setKey(java.lang.String key) {
      return (Get) super.setKey(key);
    }

    @Override
    public Get setOauthToken(java.lang.String oauthToken) {
      return (Get) super.setOauthToken(oauthToken);
    }

    @Override
    public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Get) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Get setQuotaUser(java.lang.String quotaUser) {
      return (Get) super.setQuotaUser(quotaUser);
    }

    @Override
    public Get setUserIp(java.lang.String userIp) {
      return (Get) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer tvdbid;

    /**

     */
    public java.lang.Integer getTvdbid() {
      return tvdbid;
    }

    public Get setTvdbid(java.lang.Integer tvdbid) {
      this.tvdbid = tvdbid;
      return this;
    }

    @Override
    public Get set(String parameterName, Object value) {
      return (Get) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "list".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link List#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public List list() throws java.io.IOException {
    List result = new List();
    initialize(result);
    return result;
  }

  public class List extends ShowsRequest<com.uwetrottmann.seriesguide.shows.model.CollectionResponseShow> {

    private static final String REST_PATH = "list";

    /**
     * Create a request for the method "list".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
     * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected List() {
      super(Shows.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.shows.model.CollectionResponseShow.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public List setAlt(java.lang.String alt) {
      return (List) super.setAlt(alt);
    }

    @Override
    public List setFields(java.lang.String fields) {
      return (List) super.setFields(fields);
    }

    @Override
    public List setKey(java.lang.String key) {
      return (List) super.setKey(key);
    }

    @Override
    public List setOauthToken(java.lang.String oauthToken) {
      return (List) super.setOauthToken(oauthToken);
    }

    @Override
    public List setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (List) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public List setQuotaUser(java.lang.String quotaUser) {
      return (List) super.setQuotaUser(quotaUser);
    }

    @Override
    public List setUserIp(java.lang.String userIp) {
      return (List) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public List setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public List setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public List set(String parameterName, Object value) {
      return (List) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "remove".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link Remove#execute()} method to invoke the remote operation.
   *
   * @param tvdbid
   * @return the request
   */
  public Remove remove(java.lang.Integer tvdbid) throws java.io.IOException {
    Remove result = new Remove(tvdbid);
    initialize(result);
    return result;
  }

  public class Remove extends ShowsRequest<com.uwetrottmann.seriesguide.shows.model.Show> {

    private static final String REST_PATH = "remove/{tvdbid}";

    /**
     * Create a request for the method "remove".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link Remove#execute()} method to invoke the remote operation. <p> {@link
     * Remove#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param tvdbid
     * @since 1.13
     */
    protected Remove(java.lang.Integer tvdbid) {
      super(Shows.this, "DELETE", REST_PATH, null, com.uwetrottmann.seriesguide.shows.model.Show.class);
      this.tvdbid = com.google.api.client.util.Preconditions.checkNotNull(tvdbid, "Required parameter tvdbid must be specified.");
    }

    @Override
    public Remove setAlt(java.lang.String alt) {
      return (Remove) super.setAlt(alt);
    }

    @Override
    public Remove setFields(java.lang.String fields) {
      return (Remove) super.setFields(fields);
    }

    @Override
    public Remove setKey(java.lang.String key) {
      return (Remove) super.setKey(key);
    }

    @Override
    public Remove setOauthToken(java.lang.String oauthToken) {
      return (Remove) super.setOauthToken(oauthToken);
    }

    @Override
    public Remove setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Remove) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Remove setQuotaUser(java.lang.String quotaUser) {
      return (Remove) super.setQuotaUser(quotaUser);
    }

    @Override
    public Remove setUserIp(java.lang.String userIp) {
      return (Remove) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer tvdbid;

    /**

     */
    public java.lang.Integer getTvdbid() {
      return tvdbid;
    }

    public Remove setTvdbid(java.lang.Integer tvdbid) {
      this.tvdbid = tvdbid;
      return this;
    }

    @Override
    public Remove set(String parameterName, Object value) {
      return (Remove) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "save".
   *
   * This request holds the parameters needed by the shows server.  After setting any optional
   * parameters, call the {@link Save#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.uwetrottmann.seriesguide.shows.model.ShowList}
   * @return the request
   */
  public Save save(com.uwetrottmann.seriesguide.shows.model.ShowList content) throws java.io.IOException {
    Save result = new Save(content);
    initialize(result);
    return result;
  }

  public class Save extends ShowsRequest<com.uwetrottmann.seriesguide.shows.model.ShowList> {

    private static final String REST_PATH = "save";

    /**
     * Create a request for the method "save".
     *
     * This request holds the parameters needed by the the shows server.  After setting any optional
     * parameters, call the {@link Save#execute()} method to invoke the remote operation. <p> {@link
     * Save#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.uwetrottmann.seriesguide.shows.model.ShowList}
     * @since 1.13
     */
    protected Save(com.uwetrottmann.seriesguide.shows.model.ShowList content) {
      super(Shows.this, "POST", REST_PATH, content, com.uwetrottmann.seriesguide.shows.model.ShowList.class);
    }

    @Override
    public Save setAlt(java.lang.String alt) {
      return (Save) super.setAlt(alt);
    }

    @Override
    public Save setFields(java.lang.String fields) {
      return (Save) super.setFields(fields);
    }

    @Override
    public Save setKey(java.lang.String key) {
      return (Save) super.setKey(key);
    }

    @Override
    public Save setOauthToken(java.lang.String oauthToken) {
      return (Save) super.setOauthToken(oauthToken);
    }

    @Override
    public Save setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Save) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Save setQuotaUser(java.lang.String quotaUser) {
      return (Save) super.setQuotaUser(quotaUser);
    }

    @Override
    public Save setUserIp(java.lang.String userIp) {
      return (Save) super.setUserIp(userIp);
    }

    @Override
    public Save set(String parameterName, Object value) {
      return (Save) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Shows}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Shows}. */
    @Override
    public Shows build() {
      return new Shows(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ShowsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setShowsRequestInitializer(
        ShowsRequestInitializer showsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(showsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
