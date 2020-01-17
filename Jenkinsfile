class Example { 
   static void main(String[] args) { 
      Date date = new Date(); 
      
      // display time and date using toString() 
      System.out.println(date.toString()); 
   } 
} 
def example = new Example(this)


node {
    stage("first"){
        echo "Hello"
    }
    stage("intro"){
        echo "Hello from Jenkins"
    }
    stage("return date"){
       sh """
       #!/bin/bash
       timeNow=\$(date +"The local time is %r") 
       echo \$timeNow
       """
      
        // sh "date +"%T" < outFile"
        // curDate = readFile "outFile"
        // echo "The current date is ${curDate}"

        // sh "TIMENOW=$ (date +"The local time is %r")"
        // echo "${TIMENOW}"
        // curTime = sh "date + "%T" "
        // echo "Current time : ${curTime}"
        // // sh "STR=${date + "%T"}"
    }
    stage("Slack Notification"){
        slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#90-day-plan', color: 'danger', 
        message: "The current time is ${curDate}", teamDomain: 'adidas', tokenCredentialId: 'Pipeline-Slack-Token', username: 'Slack-Bot'
    }
}
        