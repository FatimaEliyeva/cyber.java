public class CyberSecurity {
    String attackType;
    int riskLevel;
    boolean isDetected;
    double affectedSystems;
    char severityScore;


    public CyberSecurity(String attackType, int riskLevel, boolean isDetected, double affectedSystems, char severityScore) {

        this.attackType = attackType;
        this.riskLevel = riskLevel;
        this.isDetected = isDetected;
        this.affectedSystems = affectedSystems;
        this.severityScore = severityScore;
    }
        public void analyzeRisk() {
            System.out.println("Attack Type :" + attackType);
            System.out.println("Risk Level (1-10) :" + riskLevel);
            System.out.println("Detected :" + ((isDetected) ? "Yes" : "No"));

        }

        public void defend() {
            if (isDetected) {
                System.out.println("Defensive actions initiated against " + attackType + ".");
            } else {
                System.out.println("Warning! Undetected attack: " + attackType);
            }
        }

        public void report()
        {
            System.out.println("Cybersecurity Report:");
            System.out.println("Attack Type : " + attackType);
            System.out.println("Risk Level : " + riskLevel);
            System.out.println("Detected : " + (isDetected ? "Yes" : "No"));
            System.out.println("Affected Systems : " + affectedSystems);
            System.out.println("Severity Score : " + severityScore);
        }
    }
