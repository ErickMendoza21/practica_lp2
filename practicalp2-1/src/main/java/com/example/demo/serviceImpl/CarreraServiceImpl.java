package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarreraEntity;
import com.example.demo.repository.CarreraRepository;
import com.example.demo.service.CarreraService;
@Service
public class CarreraServiceImpl implements CarreraService{
	
	@Autowired
	private CarreraRepository productoRepository;

	@Override
	public CarreraEntity create(CarreraEntity carre) {
		// TODO Auto-generated method stub
		return productoRepository.save(carre);
	}

	@Override
	public List<CarreraEntity> readAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public CarreraEntity update(CarreraEntity carre) {
		// TODO Auto-generated method stub
		return productoRepository.save(carre);
	}

	@Override
	public void delete(Long id) {
		productoRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public CarreraEntity read(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id).get();
	}

}
