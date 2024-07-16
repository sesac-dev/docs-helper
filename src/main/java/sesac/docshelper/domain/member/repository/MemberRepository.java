package sesac.docshelper.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sesac.docshelper.domain.member.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);
}
