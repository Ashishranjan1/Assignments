package com.model.training.service.trainee;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.model.training.exceptions.DataAccessException;
import com.model.training.exceptions.TraineeNotFoundException;
import com.model.training.persistence.trainee.Trainee;
import com.model.training.persistence.trainee.TraineeDao;
import com.model.training.persistence.trainee.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{

	private TraineeDao traineeDao;
	
	public TraineeServiceImpl() {
		traineeDao = new TraineeDaoImpl();
	}
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public List<Trainee> getAll() throws DataAccessException {
		List<Trainee> trainees = new ArrayList<>();
		trainees = traineeDao.getAll();
		return trainees;
	}

	@Override
	public Optional<Trainee> getById(int id) throws TraineeNotFoundException {
		Optional<Trainee> trainee = traineeDao.getById(id);
		return trainee;
	}

}