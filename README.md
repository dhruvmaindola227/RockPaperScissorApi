# RockPaperScissorApi

### Error rectification 
#### 1. -> The Controller and Service directory were outside com.example.demo. They have to be inside that directory because the application starts to look for controller and services there.
#### 2. -> @Service annotation missing in the GameService class.
#### 3. -> Random Number has to be generated everytime the playGame() is called otherwise it will remain same and computer will not choose randomly.
#### 4. -> Handled the TIE Case.
