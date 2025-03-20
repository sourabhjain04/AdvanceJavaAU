package com.question.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	private QuestionRepository questionRepository ;
	
	
	
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getOne(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question not found !!"));
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(quizId);
	}
    
	
}
