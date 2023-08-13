package com.newcourse.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewSpringBootApplication {

	public static void main(String[] args) {
		
//		ApplicationContext context = 
				
				SpringApplication.run(NewSpringBootApplication.class, args);

		
		
//		* Is This the Way to Perform Crud Operation in entry level Class *
		
		
		
//		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user1 = new User();
//		user1.setName("Vaishnavi Patil");
//		user1.setCity("Mumbai");
//		user1.setStatus("I am second gf of satish nirmal");
//		
//		User user2 = new User();
//		user2.setName("Sanjana Desai");
//		user2.setCity("Nanded");
//		user2.setStatus("I am first gf of satish nirmal");

//		Save Single user
//		User user1 = userRepository.save(user);
//		
//		List<User> list = new ArrayList<User>();
//		list.add(user1);
//		list.add(user2);
//		
//		list.forEach(ele ->{
//			System.out.println(ele);
//		});

//	 userRepository.saveAll(list);

//		Update User by Id =====>>>>>

//		Optional<User> optional = userRepository.findById((long) 3);
//		
//		User user = optional.get();
//		
//		user.setName("Sanjana Satish Nirmal");
//		user.setCity("Pune");
//		userRepository.save(user);
//		System.out.println(user);

//	 Optional<User> optional2 = userRepository.findById((long) 4);
//	 
//	 User user2 = optional2.get();
//	 
//	 userRepository.delete(user2);

//		FindAll USer ==============>>.....

//		List<User> users = userRepository.findAll();
//				System.out.println(users);

//		User user = new User();
//		
//		user.setName("Satish Nirmal");
//		user.setCity("Hinjewadi pune");
//		user.setStatus("Im A FullStack Mobile Application Developer");
//		
//		
//		userRepository.save(user);

//		Optional<User> findById = userRepository.findById((long) 2);
//		User user2 = findById.get();
//		
//		user2.setName("Vaishnavi Patil");
//		user2.setCity("Mumbai");
//		
//		userRepository.save(user2);

//		Optional<User> deleteUser = userRepository.findById((long) 152);
//		
//		User user = deleteUser.get();
//		
//		userRepository.delete(user);

//	============" After 1 Day Returning to coding "===========

//		UserRepository userRepo = context.getBean(UserRepository.class);
//		
//		User  user100 = new User();
//		
//		user100.setName("Durga Devi");
//		user100.setCity("Katraj,Pune");
//		user100.setStatus("UI/UX Developer");
//		
//		
//		User user200 = new User();
//		
//		user200.setName("Pari");
//		user200.setCity("Udgir");
//		user200.setStatus("Chutiya Katna");
//		
//		User user300 = new User();
//		
//		user300.setName("Pallavi Dhondiparge");
//		user300.setCity("Ugdir");
//		user300.setStatus("Exxxxx gf of satish nirmal and get out from my life miss ghatiya aaurat");
//		
//		
//		List<User>  list = new ArrayList<>();
//		
//		list.add(user100);
//		list.add(user200);
//		list.add(user300);
//		
//		
//		List<User> saveAll = userRepo.saveAll(list);
//		
//		System.out.println(saveAll);

//		Optional<User> findUser = userRepo.findById((long) 2);
//		
//		User user252 = findUser.get();
//		
//		user252.setName("Vaishnavi Somashe");
//		user252.setCity("KoparGaon");
//		user252.setStatus("My Special One");
//		
//		userRepo.save(user252);
//		
//		System.out.println(user252);

//		Optional<User> findUser = userRepo.findById((long) 203);
//		
//		User user253 = findUser.get();
//		
//		userRepo.delete(user253);

//		 Optional<User> findById = userRepo.findById((long) 102); 
//		 System.out.println(findById);

//		List<User> name = userRepo.findByName("Vaishnavi");
//		System.out.println(name);

			}
}
