package pl.sternik.mr.rest.jaxrs;

import javax.ws.rs.*;

@Path("/store")
public class Store {

    @GET
    @Path("/article/{id}")
    @Produces("application/json")
    public Article getArticle(@PathParam("id") String id) {
        Article article = new Article();
        article.setId(5);
        article.setName("Mleko");
        return article;
    }

    @PUT
    @Path("/article")
    @Consumes("application/json")
    public void addArticle(Article art) {
    }
}
