//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Create window
        JFrame frame = new JFrame("Student Job Matcher");

        frame.setSize(600, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // -------------------------
        // TITLE
        // -------------------------

        JLabel title = new JLabel(
                "STUDENT SKILL & JOB MATCHER",
                SwingConstants.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 22));

        frame.add(title, BorderLayout.NORTH);


        // -------------------------
        // MAIN PANEL
        // -------------------------

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(0, 2, 10, 10));


        // -------------------------
        // NAME
        // -------------------------

        panel.add(new JLabel("Enter Your Name:"));

        JTextField nameField = new JTextField();

        panel.add(nameField);


        // -------------------------
        // EMAIL
        // -------------------------

        panel.add(new JLabel("Enter Your Email:"));

        JTextField emailField = new JTextField();

        panel.add(emailField);


        // -------------------------
        // SKILLS
        // -------------------------

        panel.add(new JLabel("Select Your Skills:"));


        JPanel skillsPanel = new JPanel();

        skillsPanel.setLayout(
                new GridLayout(0, 1)
        );


        JCheckBox java = new JCheckBox("Java");

        JCheckBox python = new JCheckBox("Python");

        JCheckBox sql = new JCheckBox("SQL");

        JCheckBox machineLearning =
                new JCheckBox("Machine Learning");

        JCheckBox excel = new JCheckBox("Excel");

        JCheckBox powerBI =
                new JCheckBox("Power BI");

        JCheckBox html =
                new JCheckBox("HTML");

        JCheckBox css =
                new JCheckBox("CSS");

        JCheckBox javascript =
                new JCheckBox("JavaScript");

        JCheckBox dataStructures =
                new JCheckBox("Data Structures");


        // Add checkboxes

        skillsPanel.add(java);
        skillsPanel.add(python);
        skillsPanel.add(sql);
        skillsPanel.add(machineLearning);
        skillsPanel.add(excel);
        skillsPanel.add(powerBI);
        skillsPanel.add(html);
        skillsPanel.add(css);
        skillsPanel.add(javascript);
        skillsPanel.add(dataStructures);


        panel.add(skillsPanel);


        // Add panel to window

        frame.add(
                panel,
                BorderLayout.CENTER
        );


        // -------------------------
        // BUTTON
        // -------------------------

        JButton button =
                new JButton("FIND JOBS");


        button.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );


        frame.add(
                button,
                BorderLayout.SOUTH
        );


        // -------------------------
        // BUTTON ACTION
        // -------------------------

        button.addActionListener(e -> {

            String name =
                    nameField.getText();

            String email =
                    emailField.getText();


            // Check name

            if (name.isEmpty()) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter your name."
                );

                return;
            }


            // -------------------------
            // CHECK SELECTED SKILLS
            // -------------------------

            int javaSkill = 0;
            int pythonSkill = 0;
            int sqlSkill = 0;
            int mlSkill = 0;
            int excelSkill = 0;
            int powerBISkill = 0;
            int htmlSkill = 0;
            int cssSkill = 0;
            int javascriptSkill = 0;
            int dataStructureSkill = 0;


            if (java.isSelected()) {
                javaSkill = 1;
            }

            if (python.isSelected()) {
                pythonSkill = 1;
            }

            if (sql.isSelected()) {
                sqlSkill = 1;
            }

            if (machineLearning.isSelected()) {
                mlSkill = 1;
            }

            if (excel.isSelected()) {
                excelSkill = 1;
            }

            if (powerBI.isSelected()) {
                powerBISkill = 1;
            }

            if (html.isSelected()) {
                htmlSkill = 1;
            }

            if (css.isSelected()) {
                cssSkill = 1;
            }

            if (javascript.isSelected()) {
                javascriptSkill = 1;
            }

            if (dataStructures.isSelected()) {
                dataStructureSkill = 1;
            }


            // -------------------------
            // DATA ANALYST
            // -------------------------

            int dataAnalystMatches =
                    pythonSkill
                            + sqlSkill
                            + excelSkill
                            + powerBISkill;

            double dataAnalystPercentage =
                    dataAnalystMatches * 100.0 / 4;


            // -------------------------
            // JAVA DEVELOPER
            // -------------------------

            int javaDeveloperMatches =
                    javaSkill
                            + sqlSkill
                            + dataStructureSkill;

            double javaDeveloperPercentage =
                    javaDeveloperMatches * 100.0 / 3;


            // -------------------------
            // MACHINE LEARNING INTERN
            // -------------------------

            int mlInternMatches =
                    pythonSkill
                            + mlSkill
                            + sqlSkill
                            + excelSkill;

            double mlInternPercentage =
                    mlInternMatches * 100.0 / 4;


            // -------------------------
            // WEB DEVELOPER
            // -------------------------

            int webDeveloperMatches =
                    htmlSkill
                            + cssSkill
                            + javascriptSkill;

            double webDeveloperPercentage =
                    webDeveloperMatches * 100.0 / 3;


            // -------------------------
            // FIND BEST JOB
            // -------------------------

            String bestJob = "Data Analyst";

            double bestPercentage =
                    dataAnalystPercentage;


            if (javaDeveloperPercentage > bestPercentage) {

                bestPercentage =
                        javaDeveloperPercentage;

                bestJob =
                        "Java Developer";
            }


            if (mlInternPercentage > bestPercentage) {

                bestPercentage =
                        mlInternPercentage;

                bestJob =
                        "Machine Learning Intern";
            }


            if (webDeveloperPercentage > bestPercentage) {

                bestPercentage =
                        webDeveloperPercentage;

                bestJob =
                        "Web Developer";
            }


            // -------------------------
            // CREATE RESULT
            // -------------------------

            String result = "";

            result +=
                    "================================\n";

            result +=
                    "       JOB RECOMMENDATIONS\n";

            result +=
                    "================================\n\n";

            result +=
                    "Student Name: "
                            + name
                            + "\n";

            result +=
                    "Email: "
                            + email
                            + "\n\n";


            result +=
                    "JOB MATCHES\n";

            result +=
                    "--------------------------------\n";


            result +=
                    "Data Analyst       : "
                            + String.format(
                            "%.2f",
                            dataAnalystPercentage
                    )
                            + "%\n";


            result +=
                    "Java Developer     : "
                            + String.format(
                            "%.2f",
                            javaDeveloperPercentage
                    )
                            + "%\n";


            result +=
                    "ML Intern          : "
                            + String.format(
                            "%.2f",
                            mlInternPercentage
                    )
                            + "%\n";


            result +=
                    "Web Developer      : "
                            + String.format(
                            "%.2f",
                            webDeveloperPercentage
                    )
                            + "%\n\n";


            result +=
                    "================================\n";

            result +=
                    "          BEST JOB\n";

            result +=
                    "================================\n";


            result +=
                    "Job: "
                            + bestJob
                            + "\n";


            result +=
                    "Match: "
                            + String.format(
                            "%.2f",
                            bestPercentage
                    )
                            + "%\n\n";


            // -------------------------
            // SIMPLE RECOMMENDATION
            // -------------------------

            result +=
                    "SMART RECOMMENDATION\n";

            result +=
                    "--------------------------------\n";


            switch (bestJob) {
                case "Data Analyst" -> {

                    if (powerBISkill == 0) {

                        result +=
                                "Learn Power BI to improve\n"
                                        + "your Data Analyst skills.";

                    } else {

                        result +=
                                "You have the important skills\n"
                                        + "for Data Analyst.";
                    }
                }
                case "Java Developer" -> {

                    if (dataStructureSkill == 0) {

                        result +=
                                "Learn Data Structures to improve\n"
                                        + "your Java Developer profile.";

                    } else {

                        result +=
                                "You have the important skills\n"
                                        + "for Java Developer.";
                    }
                }
                case "Machine Learning Intern" -> {

                    if (mlSkill == 0) {

                        result +=
                                "Learn Machine Learning to improve\n"
                                        + "your ML profile.";

                    } else {

                        result +=
                                "You have the important skills\n"
                                        + "for an ML Internship.";
                    }
                }
                default -> {

                    if (javascriptSkill == 0) {

                        result +=
                                "Learn JavaScript to improve\n"
                                        + "your Web Developer profile.";

                    } else {

                        result +=
                                "You have the important skills\n"
                                        + "for Web Development.";
                    }
                }
            }


            // -------------------------
            // SHOW RESULT
            // -------------------------

            JTextArea resultArea =
                    new JTextArea(result);

            resultArea.setFont(
                    new Font(
                            "Monospaced",
                            Font.PLAIN,
                            14
                    )
            );

            resultArea.setEditable(false);


            JOptionPane.showMessageDialog(
                    frame,
                    new JScrollPane(resultArea),
                    "Your Job Recommendations",
                    JOptionPane.INFORMATION_MESSAGE
            );

        });


        // -------------------------
        // SHOW WINDOW
        // -------------------------

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}