package dznine.projectdb.repository;

import dznine.projectdb.entity.Actions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActionRepository extends JpaRepository<Actions, Integer> {
    @Override
    Optional<Actions> findById(Integer integer);

    @Override
    Actions getOne(Integer integer);
}
