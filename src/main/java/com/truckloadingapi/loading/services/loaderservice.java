package com.truckloadingapi.loading.services;

import java.util.List;

import com.truckloadingapi.loading.entities.loaders;


public interface loaderservice {

	public List<loaders> getnames();
	
	public loaders getname(long truckidid);
	
	public loaders addname(loaders load);
	
	public loaders updatename(loaders load);
	
	public void deletename(long parseLong);
}
