package com.docencia.tasks.adapters.out.persistence.security;

import com.docencia.tasks.adapters.out.persistence.UserPersistenceAdapter;
import com.docencia.tasks.adapters.out.persistence.jpa.RolJpaEntity;
import com.docencia.tasks.adapters.out.persistence.jpa.UserJpaEntity;
import com.docencia.tasks.adapters.out.persistence.repository.UserJpaRepository;

public class SecurityPersistenceTest {

    RolJpaEntity rol;
    UserJpaEntity user;
    UserJpaRepository jpaRepo;
    UserPersistenceAdapter securityPersistence;
/*
    @BeforeEach
    void setUp() {
        jpaRepo = mock(UserJpaRepository.class);
        securityPersistence = new UserPersistenceAdapter(jpaRepo);
        user = new UserJpaEntity(1L, "user", "user123");
        rol = new RolJpaEntity(1L, "USER");
    }

    @Test
    void getAll() {
        when(jpaRepo.findAll()).thenReturn(List.of(user));
        List<UserJpaEntity> result = securityPersistence.getAll();
        assertEquals(1, result.size());
        assertEquals(user, result.get(0));
        verify(jpaRepo).findAll();
    }

    @Test
    void getById() {
        when(jpaRepo.findById(1l)).thenReturn(Optional.of(user));
        UserJpaEntity result = securityPersistence.getById(1L);
        assertNotNull(result);
        assertEquals(user, result);
        verify(jpaRepo).findById(1L);
    }

    @Test
    void deleteUserNull() {
        boolean result = securityPersistence.delete(null);
        assertFalse(result);
    }

    @Test
    void deleteUserIdNull() {
        UserJpaEntity userNull = new UserJpaEntity();
        boolean result = securityPersistence.delete(userNull);
        assertFalse(result);
    }

    @Test
    void deleteUserTest() {
        boolean result = securityPersistence.delete(user);
        assertTrue(result);
        verify(jpaRepo).delete(user);
    }

    @Test
    void saveUserWithoutRolesTest() {
        user.setRoles(null);
        when(jpaRepo.save(user)).thenReturn(user);

        UserJpaEntity result = securityPersistence.save(user, rol);

        assertNotNull(result.getRoles());
        assertTrue(result.getRoles().contains(rol));
        verify(jpaRepo).save(user);
    }

    @Test
    void saveUserWithRolesTest() {
        user.setRoles(new HashSet<>());
        when(jpaRepo.save(user)).thenReturn(user);

        UserJpaEntity result = securityPersistence.save(user, rol);

        assertTrue(result.getRoles().contains(rol));
        verify(jpaRepo).save(user);
    }

    @Test
    void updateUserNotFoundTest() {
        when(jpaRepo.findById(1L)).thenReturn(Optional.empty());
        UserJpaEntity result = securityPersistence.update(user, rol);
        assertNull(result);
    }

    @Test
    void updateUserWithNullRolesTest() {
        user.setRoles(null);
        when(jpaRepo.findById(user.getId())).thenReturn(Optional.of(user));
        when(jpaRepo.save(user)).thenReturn(user);

        UserJpaEntity result = securityPersistence.update(user, rol);

        assertNotNull(result.getRoles());
        assertTrue(result.getRoles().contains(rol));
        verify(jpaRepo).save(user);
    }

    @Test
    void updateUserWithExistingRolesTest() {
        HashSet<RolJpaEntity> roles = new HashSet<>();
        user.setRoles(roles);
        when(jpaRepo.findById(user.getId())).thenReturn(Optional.of(user));
        when(jpaRepo.save(user)).thenReturn(user);

        UserJpaEntity result = securityPersistence.update(user, rol);

        assertTrue(result.getRoles().contains(rol));
        verify(jpaRepo).save(user);
    }*/
}
