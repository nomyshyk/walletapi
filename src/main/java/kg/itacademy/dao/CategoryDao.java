package kg.itacademy.dao;

import kg.itacademy.model.Category;
import kg.itacademy.model.User;

import java.util.*;

public class CategoryDao {

    private static final Map<Integer, Category> categoryMap =
            new HashMap<Integer, Category>();

    static {
        initCats();
    }

    private static void initCats() {

        Category c1 = new Category(1, "Расходы на питание",
                UserDao.getUser(1), true);
        Category c2 = new Category(2, "Транспорт",
                UserDao.getUser(1), true);
        Category c3 = new Category(3, "Развлечения",
                UserDao.getUser(1), true);
        Category c4 = new Category(4, "Развлечения",
                UserDao.getUser(2), true);

        categoryMap.put(c1.getId(), c1);
        categoryMap.put(c2.getId(), c2);
        categoryMap.put(c3.getId(), c3);
        categoryMap.put(c4.getId(), c4);

    }

    public static Category getCat(Integer catId) {
        return categoryMap.get(catId);
    }

    public static Category addCat(Category cat) {
        if(cat.getUser() == null){
            cat.setUser(null);
        }
        categoryMap.put(cat.getId(), cat);
        return cat;
    }

    public static Category updateCategory(Category category) {
        categoryMap.put(category.getId(), category);
        return category;
    }

    public static void deleteCategory(Integer catId) {
        categoryMap.remove(catId);
    }

    public static List<Category> getAllCat() {
        Collection<Category> c = categoryMap.values();
        List<Category> list = new ArrayList<Category>();
        list.addAll(c);
        return list;
    }

}