
// NO.2
node {
    stage("intro"){
        echo "Hello from Jenkins"
    }
    stage("return date"){
        CurrDate = sh(script: "date", returnStdout: true)
        return CurrDate
    //  sh 'date > outFile'
    //  curDate = readFile 'outFile'
    //  echo "The current date is ${curDate}"
    
    }
    stage("Slack Notification"){
        slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#90-day-plan', color: 'danger', 
        message: "The current date is ${CurrDate}", teamDomain: 'adidas', tokenCredentialId: 'Pipeline-Slack-Token', username: 'Slack-Bot'
    }
}
