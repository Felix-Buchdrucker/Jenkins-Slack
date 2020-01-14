node {
        stage{
            echo "Hello from Jenkins"
        }
        stage("Slack Notification"){
            slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#90-day-plan', color: '#BADA55', 
            message: 'Hello from Jenkins!', teamDomain: 'adidas', tokenCredentialId: 'Pipeline-Slack-Token', username: 'Slack-Bot'
        }
    }