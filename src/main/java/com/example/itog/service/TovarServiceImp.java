package com.example.itog.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itog.models.Category;
import com.example.itog.models.Tovar;
import com.example.itog.models.repository.TovarRepository;

@Service
public class TovarServiceImp implements TovarService {

    @Autowired
    private TovarRepository reppsitory;

    @Override
    public Tovar saveTovar(Tovar tovar) {
        return reppsitory.save(tovar);
    }

    @Override
    public List<Tovar> fetchTovarList() {
        return (List<Tovar>) reppsitory.findAll();
    }

    @Override
    public Tovar updateTovar(Tovar tovar, Integer tovarId) {
        Tovar depDB = reppsitory.findById(tovarId)
                .get();

        if (Objects.nonNull(tovar.getName())
                && !"".equalsIgnoreCase(
                    tovar.getName())) {
            depDB.setName(tovar.getName());
        }

        if (Objects.nonNull(tovar.getCount())
                && 0 <= tovar.getCount()) {
            depDB.setCount((depDB.getCount() + tovar.getCount()));
        }

        if (Objects.nonNull(tovar.getCategory())) {
            depDB.setCategory(tovar.getCategory());
        }

        return reppsitory.save(depDB);
    }

    @Override
    public void deleteTovar(Integer tovarId) {
        reppsitory.deleteById(tovarId);
    }

    @Override
    public List<Category> fetchCategoryList(String nameTovar) {
      
        return (List<Category>) reppsitory.findByTovarName(nameTovar);
    }

   

}
