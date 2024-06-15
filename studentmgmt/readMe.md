# Requirements
## home screen
	Req1. display below menu on start of the app
	----> Student Management <----
	1. List All
	2. Add Student 
	3. Delete Student
	4. Modify Student
	5. Update Student 
	5. Quit
	
	Note: Follow the same menu order, indexes should be the user choice

	Req2. Read user choice from the above menu and perform the selected operation
	
	
	
	
# Code structure
* StudenMgmt.java
	- main()
	- Managing whole functionality / its mail class to run the prog
	- All actions should be deligate
* Menu.java
	- display user menu
	
* Actions.java
	- List
		-- Call UserStore and retrieve the all students
		-- display student records as table format 
		
* UserStore.java
	- It should store all student details
	- Every student details should be a Student type
	
* Student.java
	- Should have below properties 
	- name, age, class, gender
	