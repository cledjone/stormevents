package projeto.framework.persistence;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class GenericoDAO<Entidade> implements GenericoIDAO<Entidade>{

	protected EntityManager entityManager;
	protected Class<Entidade> classePersistente;

	@SuppressWarnings("unchecked")
	public GenericoDAO(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stormevents");
		
		entityManager = emf.createEntityManager();
				
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();  
	    classePersistente = (Class<Entidade>) parameterizedType.getActualTypeArguments()[0];  
	}
	
	public final void alterar(Entidade objeto) {
		EntityTransaction tx = getEntityManager().getTransaction();
		try {
			tx.begin();
			
			objeto = getEntityManager().merge(objeto);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()){
				tx.rollback();
			}
		}
	}

	public final void inserir(Entidade objeto) {
		EntityTransaction tx = getEntityManager().getTransaction();		
		try {
			tx.begin();
			getEntityManager().persist(objeto);
			tx.commit();
			System.out.println(classePersistente.getSimpleName() + " salvo com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()){
				tx.rollback();
			}
		}
	}

	public final void inserirColecao(Collection<Entidade> colecao) {
		EntityTransaction tx = getEntityManager().getTransaction();
		try {
			tx.begin();

			for (Entidade entidade : colecao) {
				getEntityManager().persist(entidade);	
			}
			
			tx.commit();
			
			System.out.println(classePersistente.getSimpleName() + " salvos com sucesso: " + colecao.size());
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()){
				tx.rollback();
			}
		}
	}
	
	public final void remover(Entidade objeto) {
		EntityTransaction tx = getEntityManager().getTransaction();
		try {
			tx.begin();
	
			refresh(objeto);
			getEntityManager().remove(objeto);
			
			tx.commit();
			
			System.out.println(classePersistente.getSimpleName() + " removido com sucesso");
		} catch (Exception e){
			e.printStackTrace();
			if (tx != null && tx.isActive()){
				tx.rollback();
			}
		}
	}

	public final Entidade consultarPorId(Integer chave) {
		Entidade instance = null;
		try {
			instance = (Entidade) getEntityManager().find(classePersistente, chave);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		return instance;
	}


	public final Entidade consultarPorNome(String chave) {
		Entidade instance = null;
		try {
			instance = (Entidade) getEntityManager().find(classePersistente, chave);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		return instance;
	}

	public List<Entidade> consultarTodos() {
		try {
			String sql = "from " + classePersistente.getSimpleName();
			TypedQuery<Entidade> query = entityManager.createQuery(sql, classePersistente);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public final void refresh(Entidade object) {
		getEntityManager().refresh(object);
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

		
}
