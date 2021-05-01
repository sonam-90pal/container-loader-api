package com.truckloadingapi.loading.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truckloadingapi.loading.entities.loaders;

public interface loadersdao extends JpaRepository<loaders, Long> {

}
