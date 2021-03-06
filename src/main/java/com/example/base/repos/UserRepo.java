package com.example.base.repos;

import com.example.base.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// Репозторий - механизм взаимодействия с базой
// CrudRepository несёт в себе некоторые стандартные функции(Например, findById), которые не нужно потом прописывать
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
    @Query("SELECT user FROM User user WHERE user.login=:login")
    User findUserByLogin(@Param("login") String login);
}
