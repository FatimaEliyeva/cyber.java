public class Main {
    public static void main(String[] args) {
        CyberSecurity attack1=new CyberSecurity("DDoS", 8, true, 5.5, 'A');
        attack1.analyzeRisk();
        attack1.defend();
        attack1.report();


    }


}
/*
        +------------------------------------------------------+
        |                      CyberSecurity                   |
        +------------------------------------------------------+
        | - attackType : String                                |
        | - riskLevel  : int                                   |
        | - isDetected : boolean                               |
        | - affectedSystems : double                           |
        | - severityScore : char                               |
        +------------------------------------------------------+
        | + CyberSecurity(String, int, boolean, double, char)  |
        | + analyzeRisk() : void                               |
        | + defend() : void                                    |
        | + report() : void                                    |
        +------------------------------------------------------+
*/
