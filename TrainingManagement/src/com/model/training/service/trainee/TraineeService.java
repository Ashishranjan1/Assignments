package com.model.training.service.trainee;


import java.util.List;
import java.util.Optional;

import com.model.training.exceptions.DataAccessException;
import com.model.training.exceptions.TraineeNotFoundException;
import com.model.training.persistence.trainee.Trainee;

public interface TraineeService {
	public Trainee addTrainee(Trainee trainee);
	public List<Trainee> getAll() throws DataAccessException;
	public Optional<Trainee> getById(int id) throws TraineeNotFoundException;

}