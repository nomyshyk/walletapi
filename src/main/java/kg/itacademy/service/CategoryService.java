package kg.itacademy.service;

import kg.itacademy.dao.CategoryDao;
import kg.itacademy.dao.UserDao;
import kg.itacademy.model.Category;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


@Path("/categories")
public class CategoryService {

    @XmlElement(name = "MyUserResponse")
    protected List<Category> caRet = new ArrayList<>();

    @GET
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public List<Category> getCats_JSON(@HeaderParam("user-key") String userAgent,
                                       @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        return getCatByUser(userAgent, pwdAgent);
    }

    @GET
    @Path("/{categoryId}")
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public Category getCat(@PathParam("categoryId") Integer categoryId,
                           @HeaderParam("user-key") String userAgent,
                           @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        return CategoryDao.getCat(categoryId);
}

    @POST
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})
    public Category addCat(Category category,
                           @HeaderParam("user-key") String userAgent,
                           @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }
        return CategoryDao.addCat(category);
    }

    @PUT
    @Produces({ MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML })
    public Category updateCat(Category category,
                               @HeaderParam("user-key") String userAgent,
                               @HeaderParam("password-key") String pwdAgent) {
        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }
        return CategoryDao.updateCategory(category);
    }

    @DELETE
    @Path("/{categoryId}")
    @Produces({ MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML })
    public void deleteCat(@PathParam("categoryId") Integer categoryId,
                          @HeaderParam("user-key") String userAgent,
                          @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return ;
        }
        CategoryDao.deleteCategory(categoryId);
    }

    /*@GET
    @Path("/cat/{categoryId}")
    @Produces({MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML})*/
    public List<Category> getCatByUser(
                                 @HeaderParam("user-key") String userAgent,
                                 @HeaderParam("password-key") String pwdAgent) {

        if(UserDao.auth(userAgent, pwdAgent)){
            return null;
        }

        List<Category> categoryList = CategoryDao.getAllCat();
        for(Category c : categoryList){
            if(c.getUser().getLogin().equals(userAgent)) {
                //c.setUser(null);
                caRet.add(c);
            }
        }

        System.out.println(userAgent);
        return caRet;
    }

}