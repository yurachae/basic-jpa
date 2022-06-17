package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class jpaMain {
   /* public static void main(String[] args) {
        //하나의 웹서버에 하나만 생성가능
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("start");

        //쓰레드간에 공유하지 말고 close!!!필수
       EntityManager em = emf.createEntityManager();

        //여기에 코드 작성
        //항상 transaction begin 필요
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            //회원등록
            //비영속 상태
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("memberA");

            //영속 상태 - 쿼리는 commit시 날라감
//            System.out.println("*** before ***");
//            em.persist(member);//jpa 실행
//            System.out.println("*** after ***");

            //회원조회
            //find시 1차 캐시에서 조회 - 쿼리 X
//            Member findMember = em.find(Member.class, 100L);
//            System.out.println("findMember.getId = " + findMember.getId());
//            System.out.println("findMember.getName = " + findMember.getName());

            //영속 엔티티 동일성 보장
//            Member findMember2 = em.find(Member.class, 100L);
//            System.out.println("findMemeber == findMember2 ? " + (findMember == findMember2));

            //회원삭제
//            em.remove(findMember);

            //회원수정
//            findMember.setName("memberB");

            //JPQL - 객체를 대상으로 쿼리!
//            List<Member> result = em.createQuery("select m from Member m", Member.class)
//                    .setFirstResult(1)  //페이징
//                    .setMaxResults(10)  //페이징
//                    .getResultList();
//            for (Member member : result) {
//                System.out.println("member = " + member.getId());
//            }

            //쿼리를 모았다가 commit 시 한번에 보냄 (쓰기 지연)
            //persistence.xml에서 batch size 설정가능
//            Member member1 = new Member(201L, "member201");
//            Member member2 = new Member(202L, "member202");
//
//            em.persist(member1);
//            em.flush(); //DB에 먼저 반영(쓰지 지연 데이터들이 반영됨), 1차캐시 비우지 않음
//            em.persist(member2);

            //준영속 상태
            Member findMember = em.find(Member.class, 100L);
            findMember.setName("AAA");  //영속상태
            em.detach(findMember); //준영속상태 -update문 나가지 않음
            em.clear();   //준영속상태 - 1차캐시 비움

            tx.commit(); //transaction 정상적으로 끝날 때 commit
        }catch (Exception e){
            tx.rollback();//transaction 비정상적으로 끝날 때 rollback
        }finally {
            em.close();//필수!!
        }
        emf.close();
    }*/
}
