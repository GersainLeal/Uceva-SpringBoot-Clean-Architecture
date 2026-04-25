package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CategoryDatasource {

    private final Faker faker = new Faker();
    private final Random random = new Random();
    private final String[] areas = {
            "Technology",
            "Health",
            "Finance",
            "Education",
    };

    public List<Category> getAll(int countCategories){
        List<Category> categories = new ArrayList<Category>();
        for (int i = 1; i <= countCategories; i++) {
            categories.add(generateCategory(i));
        }
        return categories;
    }

    private Category generateCategory(Integer id){
        return new Category(
                id,
                faker.commerce().department(),
                randomArea()
        );
    }

    private String randomArea() {
        return areas[random.nextInt(areas.length)];
    }
}
