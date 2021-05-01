package com.truckloadingapi.loading.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckloadingapi.loading.dao.loadersdao;
import com.truckloadingapi.loading.entities.loaders;

@Service
public class loaderserviceimpl implements loaderservice {
	
	@Autowired
	private loadersdao dao;
//	List<names> list;
	
	public loaderserviceimpl() {
		
//	  list=new ArrayList<>();
	//  list.add(new names(10, "James","Accountant"));
	//  list.add(new names(20,"Sam","Guard"));
	  
		
	}

	@Override
	public List<loaders> getnames() {
		
		return dao.findAll();
	}
	
	@Override
	public loaders getname(long truckid) {
		
	//	names m=null;
	//  for(names name:list) {
	//		if(name.getEmpid()==empid)
     //       {
	 //         m=name;
	 //          break;
     //     }
      //         }
		
		return dao.getOne(truckid);
	}
	
	@Override
	public loaders addname(loaders load) {
	//	list.add(name);
		
		dao.save(load);
		return load;
	}
	
	@Override
	public loaders updatename(loaders load) {
	//	list.forEach(e -> {
	//		if(e.getEmpid() == name.getEmpid()) {
	//			e.setName(name.getName());
	//			e.setJob(name.getJob());
	//			
	//		}
	//	});
		
		dao.save(load);
		return load;
	}
	
	@Override
	public void deletename(long parseLong) {
	//	list=this.list.stream().filter(e->e.getEmpid()!=parseLong).collect(Collectors.toList());
	loaders entity = dao.getOne(parseLong);
	dao.delete(entity);
	}

}

