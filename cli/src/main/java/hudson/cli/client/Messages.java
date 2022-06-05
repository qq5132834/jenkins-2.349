package hudson.cli.client;

import java.io.File;

public class Messages {
    public static String CLI_NoSuchFileExists(File f) {
        return "No such file exists: " + f.toString();
    }

    public static String CLI_NoURL() {
        return "Neither -s nor the JENKINS_URL env var is specified.";
    }

    public static String CLI_BadAuth() {
        return "The JENKINS_USER_ID and JENKINS_API_TOKEN env vars should be both set or left empty.";
    }

    public static String CLI_Usage() {
        return "Jenkins CLI\\n\\\n" +
                "  Usage: java -jar jenkins-cli.jar [-s URL] command [opts...] args...\\n\\\n" +
                "  Options:\\n\\\n" +
                "  \\ -s URL              : the server URL (defaults to the JENKINS_URL env var)\\n\\\n" +
                "  \\ -http               : use a plain CLI protocol over HTTP(S) (the default; mutually exclusive with -ssh)\\n\\\n" +
                "  \\ -webSocket          : like -http but using WebSocket (works better with most reverse proxies)\\n\\\n" +
                "  \\ -ssh                : use SSH protocol (requires -user; SSH port must be open on server, and user must have registered a public key)\\n\\\n" +
                "  \\ -i KEY              : SSH private key file used for authentication (for use with -ssh)\\n\\\n" +
                "  \\ -noCertificateCheck : bypass HTTPS certificate check entirely. Use with caution\\n\\\n" +
                "  \\ -noKeyAuth          : don''t try to load the SSH authentication private key. Conflicts with -i\\n\\\n" +
                "  \\ -user               : specify user (for use with -ssh)\\n\\\n" +
                "  \\ -strictHostKey      : request strict host key checking (for use with -ssh)\\n\\\n" +
                "  \\ -logger FINE        : enable detailed logging from the client\\n\\\n" +
                "  \\ -auth [ USER:SECRET | @FILE ] : specify username and either password or API token (or load from them both from a file);\\n\\\n" +
                "  \\                                 for use with -http.\\n\\\n" +
                "  \\                                 Passing credentials by file is recommended.\\n\\\n" +
                "  \\                                 See https://www.jenkins.io/redirect/cli-http-connection-mode for more info and options.\\n\\\n" +
                "  \\ -bearer [ TOKEN | @FILE ]     : specify authentication using a bearer token (or load the token from file);\\n\\\n" +
                "  \\                                 for use with -http. Mutually exclusive with -auth.\\n\\\n" +
                "  \\                                 Passing credentials by file is recommended.\\n\\\n" +
                "  \\n\\\n" +
                "  The available commands depend on the server. Run the ''help'' command to \\\n" +
                "  see the list.";
    }
}
