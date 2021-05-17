pipeline {
    agent any
    tools { 
        maven 'Maven 3.8.1' 
        jdk 'jdk8' 
    }
    stages 
{
stage('Build') 
{
steps{
echo "Building the Code.........."
bat "mvn clean"
}
}
stage('Test') 
{
steps{
echo "Testing the Code.........."
bat "mvn test"
}
}
stage('Compile') 
{
steps{
echo "Compiling the Project.........."
bat "mvn compile"
}
}
stage('Deploy') 
{
steps{
echo "Deploying the Project.........."
}
}
}
}
