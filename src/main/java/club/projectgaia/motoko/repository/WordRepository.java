package club.projectgaia.motoko.repository;

import club.projectgaia.motoko.domain.po.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, String> {
}
