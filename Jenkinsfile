// // SOLUTION NO.1
// node{
//     checkout scm
//     stage("intro"){
//         echo "Hello from Jenkins"
//     }
//     stage("return date"){
//         sh 'date > outFile'
//         curDate = readFile 'outFile'
//         echo "The current date is ${curDate}"
//     }
//     stage("Slack Notification"){
//         slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#90-day-plan', color: 'danger', 
//         message: "The current date is ${curDate}", teamDomain: 'adidas', tokenCredentialId: 'Pipeline-Slack-Token', username: 'Slack-Bot'
//     }
    
// }

// SOLUTION NO.2
node {
        checkout scm
    stage("intro"){
        echo "Hello from Jenkins"
    }
    stage("return date"){
        CurrDate = sh(script: "date", returnStdout: true)
        return CurrDate
    }
    stage("Slack Notification"){
        slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#90-day-plan', color: 'danger', 
        message: "The current date is ${CurrDate}", teamDomain: 'adidas', tokenCredentialId: 'Pipeline-Slack-Token', username: 'Slack-Bot'
    }
}
