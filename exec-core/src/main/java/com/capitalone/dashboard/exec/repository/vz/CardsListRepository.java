package com.capitalone.dashboard.exec.repository.vz;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.capitalone.dashboard.exec.model.vz.CardsList;

/**
 * Interface CardsListRepository extends PagingAndSortingRepository<CardsList,
 * ObjectId>
 * 
 * @author v143611
 */
public interface CardsListRepository extends PagingAndSortingRepository<CardsList, ObjectId> {

	/**
	 * findByEnabled()
	 * 
	 * @param enabled
	 * @return List<CardsList>
	 */
	List<CardsList> findByEnabled(Boolean enabled);

	/**
	 * findByDefaultMetricsAndEnabled()
	 * 
	 * @param defaultMetrics
	 * @param enabled
	 * @param pageable
	 * @return List<CardsList>
	 */
	List<CardsList> findByDefaultMetricsAndEnabled(Boolean defaultMetrics, Boolean enabled, Pageable pageable);

}
