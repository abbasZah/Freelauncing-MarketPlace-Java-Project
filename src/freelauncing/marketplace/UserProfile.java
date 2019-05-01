/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelauncing.marketplace;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Abbas Zaheer
 */
public class UserProfile extends javax.swing.JFrame {

    /**
     * Creates new form UserProfile
     */
    
    private String fullName;
    private String path;
    //<arraylist> String 
    
    public UserProfile() {
        initComponents();
        
        //=============================================================================Name===================================================
        Scanner fin=null;
        try {
            fin = new Scanner(new FileInputStream("RegisteredUsers.txt"));
            String line,line2,firstName,lastName;
                                while(fin.hasNextLine())//searching and checking the username.
                                {
                                    line=fin.nextLine();
                                    if(line.equals(SignIn.USERNAME))
                                    {
                                        line2=fin.nextLine();
                                        if(line2.equals(SignIn.PASSOWORD))
                                        {
                                            firstName=fin.nextLine();
                                            firstName=fin.nextLine();
                                            lastName=fin.nextLine();
                                            fullName=firstName+" "+lastName;
                                            textfield_FullName.setText(fullName);
                                            break;
                                        }
                                        
                                    }
                                }
                fin.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        //=============================================================================Name===================================================
        File file = new File("ProfileOfRegisteredUsers.txt");
        try {
            if(file.createNewFile())
            {
                
            } 
        }
        catch (IOException ex) {
            Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        //=============================================================================Name===================================================
        boolean checking=false;
                            fin = null;
                            try
                            {
                                
                                fin = new Scanner(new FileInputStream("ProfileOfRegisteredUsers.txt"));
                                
                                String line;
                                while(fin.hasNextLine())//searching and checking the username.
                                {
                                    line=fin.nextLine();
                                    if(line.equals(SignIn.USERNAME))
                                    {
                                        checking=true;
                                        break;
                                    }
                                }
                                
                                fin.close();
                            }
                            catch(FileNotFoundException exception){
                                System.out.println("File Not Found");
                            }
        if(checking==true)
        {
                            fin = null;
                            try
                            {
                                
                                fin = new Scanner(new FileInputStream("ProfileOfRegisteredUsers.txt"));
                                String path2="";
                                ArrayList <String> SkillAreaLines = new ArrayList<String>();
                                ArrayList <String> EducationAreaLines = new ArrayList<String>();
                                
                                String line,notInUse;
                                while(fin.hasNextLine())//searching and checking the username.
                                {
                                    line=fin.nextLine();
                                    if(line.equals(SignIn.USERNAME))
                                    {
                                       path2=fin.nextLine();
                                       notInUse=fin.nextLine();
                                       
                                       String skillLines;
                                       while(fin.hasNextLine())
                                       {
                                           skillLines=fin.nextLine();
                                           
                                           if(skillLines.equals("</Skills>"))
                                           {
                                               //System.out.println("breaked");
                                               break;
                                           }
                                           else
                                           {
                                               SkillAreaLines.add(skillLines);
                                               //System.out.println(skillLines);
                                           }
                                       }
                                       
                                       notInUse=fin.nextLine();
                                       String educationLines;
                                       
                                       while(fin.hasNextLine())
                                       {
                                           educationLines=fin.nextLine();
                                           
                                           if(educationLines.equals("</Education>"))
                                           {
                                               //System.out.println("breaked");
                                               break;
                                           }
                                           else
                                           {
                                               EducationAreaLines.add(educationLines);
                                               //System.out.println(educationLines);
                                           }
                                       }
                                       //System.out.println("breakedlast");
                                       break;
                                    }
                                }
                                
                                //===========================================//Restoring ALl Data
                                ImageIcon image = new ImageIcon(path2);
                                label_ImagePic.setIcon(image);
                                
                                for(String l : SkillAreaLines)
                                {
                                    jTextArea1.append(l+"\n");
                                }
                                for(String l : EducationAreaLines)
                                {
                                    jTextArea2.append(l+"\n");
                                }
                                //===========================================
                                fin.close();
                            }
                            catch(FileNotFoundException exception){
                                System.out.println("File Not Found");
                            }
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProfileHeading = new javax.swing.JLabel();
        label_ImagePic = new javax.swing.JLabel();
        label_FullName = new javax.swing.JLabel();
        textfield_FullName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        label_CountryofCollege = new javax.swing.JLabel();
        combobox_Country = new javax.swing.JComboBox();
        label_CollegeName = new javax.swing.JLabel();
        textfield_CollegeName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        label_DegreeTitle = new javax.swing.JLabel();
        combobox_DegreeTitle = new javax.swing.JComboBox();
        label_DegreeMajor = new javax.swing.JLabel();
        textfield_DegreeMajor = new javax.swing.JTextField();
        label_YearofGraduation = new javax.swing.JLabel();
        combobox_Year = new javax.swing.JComboBox();
        Btn_Update = new javax.swing.JButton();
        Btn_UploadPic = new javax.swing.JButton();
        Btn_Back = new javax.swing.JButton();
        label_AddSkill = new javax.swing.JLabel();
        combobox_Level = new javax.swing.JComboBox();
        Btn_AddSkill = new javax.swing.JButton();
        label_YourSkills = new javax.swing.JLabel();
        scrollpane_SkillList = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        textfield_AddSkill = new javax.swing.JTextField();
        label_YourSkills1 = new javax.swing.JLabel();
        scrollpane_SkillList1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Btn_OkforDegree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 45, 48));

        ProfileHeading.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ProfileHeading.setForeground(new java.awt.Color(129, 129, 131));
        ProfileHeading.setText("Profile");

        label_ImagePic.setBackground(new java.awt.Color(255, 255, 255));
        label_ImagePic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        label_FullName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_FullName.setForeground(new java.awt.Color(85, 166, 221));
        label_FullName.setText("Full Name");

        textfield_FullName.setEditable(false);
        textfield_FullName.setBackground(new java.awt.Color(45, 45, 48));
        textfield_FullName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textfield_FullName.setForeground(new java.awt.Color(255, 255, 255));
        textfield_FullName.setBorder(null);
        textfield_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_FullNameActionPerformed(evt);
            }
        });

        label_CountryofCollege.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_CountryofCollege.setForeground(new java.awt.Color(85, 166, 221));
        label_CountryofCollege.setText("Country of College/University");

        combobox_Country.setBackground(new java.awt.Color(129, 129, 131));
        combobox_Country.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combobox_Country.setForeground(new java.awt.Color(255, 255, 255));
        combobox_Country.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Country", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Côte d’Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia, Federated States of", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        label_CollegeName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_CollegeName.setForeground(new java.awt.Color(85, 166, 221));
        label_CollegeName.setText("College/University Name");

        textfield_CollegeName.setBackground(new java.awt.Color(45, 45, 48));
        textfield_CollegeName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textfield_CollegeName.setForeground(new java.awt.Color(255, 255, 255));
        textfield_CollegeName.setBorder(null);
        textfield_CollegeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_CollegeNameActionPerformed(evt);
            }
        });

        label_DegreeTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_DegreeTitle.setForeground(new java.awt.Color(85, 166, 221));
        label_DegreeTitle.setText("Degree Title");

        combobox_DegreeTitle.setBackground(new java.awt.Color(129, 129, 131));
        combobox_DegreeTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combobox_DegreeTitle.setForeground(new java.awt.Color(255, 255, 255));
        combobox_DegreeTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Major", "Assosciate", "Certificate", "B.A", "BArch", "BM", "BFA", "B.Sc.", "M.A", "M.B.A", "MFA", "M.Sc.", "J.D.", "M.D.", "Ph.D", "LLB", "LLM" }));

        label_DegreeMajor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_DegreeMajor.setForeground(new java.awt.Color(85, 166, 221));
        label_DegreeMajor.setText("Major");

        textfield_DegreeMajor.setBackground(new java.awt.Color(129, 129, 131));
        textfield_DegreeMajor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textfield_DegreeMajor.setForeground(new java.awt.Color(255, 255, 255));
        textfield_DegreeMajor.setText("Computer");
        textfield_DegreeMajor.setBorder(null);
        textfield_DegreeMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_DegreeMajorActionPerformed(evt);
            }
        });

        label_YearofGraduation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_YearofGraduation.setForeground(new java.awt.Color(85, 166, 221));
        label_YearofGraduation.setText("Year of graduation");

        combobox_Year.setBackground(new java.awt.Color(129, 129, 131));
        combobox_Year.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combobox_Year.setForeground(new java.awt.Color(255, 255, 255));
        combobox_Year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950" }));

        Btn_Update.setBackground(new java.awt.Color(85, 166, 221));
        Btn_Update.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Update.setText("Update");
        Btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UpdateActionPerformed(evt);
            }
        });

        Btn_UploadPic.setBackground(new java.awt.Color(129, 129, 131));
        Btn_UploadPic.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_UploadPic.setForeground(new java.awt.Color(255, 255, 255));
        Btn_UploadPic.setText("Upload Profile Picture");
        Btn_UploadPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UploadPicActionPerformed(evt);
            }
        });

        Btn_Back.setBackground(new java.awt.Color(129, 129, 131));
        Btn_Back.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_Back.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Back.setText("Back");
        Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackActionPerformed(evt);
            }
        });

        label_AddSkill.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_AddSkill.setForeground(new java.awt.Color(85, 166, 221));
        label_AddSkill.setText("Add Skill");

        combobox_Level.setBackground(new java.awt.Color(129, 129, 131));
        combobox_Level.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combobox_Level.setForeground(new java.awt.Color(255, 255, 255));
        combobox_Level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Experience Level", "Beginner", "Intermediate", "Expert" }));

        Btn_AddSkill.setBackground(new java.awt.Color(129, 129, 131));
        Btn_AddSkill.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_AddSkill.setForeground(new java.awt.Color(255, 255, 255));
        Btn_AddSkill.setText("Add");
        Btn_AddSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddSkillActionPerformed(evt);
            }
        });

        label_YourSkills.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_YourSkills.setForeground(new java.awt.Color(85, 166, 221));
        label_YourSkills.setText("Skills");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(129, 129, 131));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        scrollpane_SkillList.setViewportView(jTextArea1);

        textfield_AddSkill.setBackground(new java.awt.Color(129, 129, 131));
        textfield_AddSkill.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textfield_AddSkill.setForeground(new java.awt.Color(255, 255, 255));
        textfield_AddSkill.setText("Designing");
        textfield_AddSkill.setBorder(null);
        textfield_AddSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_AddSkillActionPerformed(evt);
            }
        });

        label_YourSkills1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_YourSkills1.setForeground(new java.awt.Color(85, 166, 221));
        label_YourSkills1.setText("Education");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(129, 129, 131));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        scrollpane_SkillList1.setViewportView(jTextArea2);

        Btn_OkforDegree.setBackground(new java.awt.Color(129, 129, 131));
        Btn_OkforDegree.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Btn_OkforDegree.setForeground(new java.awt.Color(255, 255, 255));
        Btn_OkforDegree.setText("Ok");
        Btn_OkforDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OkforDegreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ProfileHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Btn_Back)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Update))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_ImagePic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Btn_UploadPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textfield_FullName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label_AddSkill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox_Level, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_AddSkill)
                                    .addComponent(label_YourSkills, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollpane_SkillList, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfield_AddSkill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(scrollpane_SkillList1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_CollegeName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combobox_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_YourSkills1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(combobox_DegreeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_DegreeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(textfield_DegreeMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label_DegreeMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(label_YearofGraduation, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(combobox_Year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Btn_OkforDegree))
                                                .addComponent(textfield_CollegeName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_CountryofCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfileHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(Btn_UploadPic)
                                .addGap(18, 18, 18)
                                .addComponent(label_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfield_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(textfield_CollegeName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(label_YourSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(scrollpane_SkillList, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(label_DegreeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_DegreeMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(combobox_DegreeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textfield_DegreeMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_YearofGraduation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combobox_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Btn_OkforDegree)
                                        .addGap(5, 5, 5)
                                        .addComponent(label_YourSkills1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollpane_SkillList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btn_Update)
                                    .addComponent(Btn_Back))))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_CountryofCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_AddSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combobox_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfield_AddSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_CollegeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox_Level, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_AddSkill))
                            .addComponent(label_ImagePic, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_FullNameActionPerformed
        
    }//GEN-LAST:event_textfield_FullNameActionPerformed

    private void textfield_DegreeMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_DegreeMajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_DegreeMajorActionPerformed

    private void Btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UpdateActionPerformed
        
    boolean checking=false;
                            Scanner fin = null;
                            try
                            {
                                
                                fin = new Scanner(new FileInputStream("ProfileOfRegisteredUsers.txt"));
                                
                                String line;
                                while(fin.hasNextLine())//searching and checking the username.
                                {
                                    line=fin.nextLine();
                                    if(line.equals(SignIn.USERNAME))
                                    {
                                        checking=true;
                                        break;
                                    }
                                }
                                
                                fin.close();
                            }
                            catch(FileNotFoundException exception){
                                System.out.println("File Not Found");
                            }
        if(checking==false)
        {
            //String =" ",EducationAreaLines=" ";
            ArrayList <String> SkillAreaLines = new ArrayList<String>();
            ArrayList <String> EducationAreaLines = new ArrayList<String>();

            for(String line : jTextArea1.getText().split("\\n"))
                SkillAreaLines.add(line);
            for(String line : jTextArea2.getText().split("\\n"))
                EducationAreaLines.add(line);


            PrintWriter fout = null;
            try{
                fout = new PrintWriter(new FileOutputStream("ProfileOfRegisteredUsers.txt",true));

                fout.println(SignIn.USERNAME);
                fout.println(path);
                fout.println("<Skills>");
                //fout.println(SkillArea);
                for(String l : SkillAreaLines)
                {
                    fout.println(l);
                }
                fout.println("</Skills>");
                fout.println("<Education>");
                //fout.println(EducationArea);
                for(String l : EducationAreaLines)
                {
                    fout.println(l);
                }
                fout.println("</Education>");
                fout.println("EndOfProfile-->");

                fout.close();

                JOptionPane.showMessageDialog(this, "Updated Successfully!");
            }
            catch(FileNotFoundException e)
            {
                System.out.println("File Not Found");
                System.exit(0);
            }

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Updated !");
        }
        
        
    }//GEN-LAST:event_Btn_UpdateActionPerformed

    private void Btn_UploadPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UploadPicActionPerformed
    JFileChooser fc = new JFileChooser();
    fc.showOpenDialog(null);
    
    File f = fc.getSelectedFile();
    
    path = f.getAbsolutePath();
        ImageIcon image = new ImageIcon(path);
        
    label_ImagePic.setIcon(image);
    }//GEN-LAST:event_Btn_UploadPicActionPerformed

    private void Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_Btn_BackActionPerformed

    private void Btn_AddSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddSkillActionPerformed
        String SKILL = textfield_AddSkill.getText();
        String LEVEL="";
        
        
        if(combobox_Level.getSelectedItem() == "Experience Level")
        {
            JOptionPane.showMessageDialog(this, "Please choose experience level !");
        }
        else
        {
            LEVEL=combobox_Level.getSelectedItem().toString();
            
            jTextArea1.append(SKILL+" - "+LEVEL+"\n");
            
        }
        
        
        
    }//GEN-LAST:event_Btn_AddSkillActionPerformed

    private void textfield_AddSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_AddSkillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_AddSkillActionPerformed

    private void Btn_OkforDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OkforDegreeActionPerformed
      String collegeName = textfield_CollegeName.getText();
      String collegeMajor = textfield_DegreeMajor.getText();
      String country="",collegeTitle="", year="";
        
        if(combobox_Country.getSelectedItem() == "Country")
        {
            JOptionPane.showMessageDialog(this, "Please choose country !");
        }
        else
        {
            if(combobox_DegreeTitle.getSelectedItem() == "Major")
                {
                    JOptionPane.showMessageDialog(this, "Please choose Degree Title !");
                }
                else
                {
                    if(combobox_Year.getSelectedItem() == "Year")
                    {
                        JOptionPane.showMessageDialog(this, "Please choose Year !");
                    }
                    else
                    {
                        country=combobox_Country.getSelectedItem().toString();
                        collegeTitle=combobox_DegreeTitle.getSelectedItem().toString();
                        year=combobox_Year.getSelectedItem().toString();
                        
                        jTextArea2.setText(collegeName+"\nFrom "+country+"\n");
                        jTextArea2.append(collegeTitle+" in "+collegeMajor+"\n");
                        jTextArea2.append("Year of graduation :"+year);

                    }
                }

            
            
            
        }
    }//GEN-LAST:event_Btn_OkforDegreeActionPerformed

    private void textfield_CollegeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_CollegeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_CollegeNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AddSkill;
    private javax.swing.JButton Btn_Back;
    private javax.swing.JButton Btn_OkforDegree;
    private javax.swing.JButton Btn_Update;
    private javax.swing.JButton Btn_UploadPic;
    private javax.swing.JLabel ProfileHeading;
    private javax.swing.JComboBox combobox_Country;
    private javax.swing.JComboBox combobox_DegreeTitle;
    private javax.swing.JComboBox combobox_Level;
    private javax.swing.JComboBox combobox_Year;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel label_AddSkill;
    private javax.swing.JLabel label_CollegeName;
    private javax.swing.JLabel label_CountryofCollege;
    private javax.swing.JLabel label_DegreeMajor;
    private javax.swing.JLabel label_DegreeTitle;
    private javax.swing.JLabel label_FullName;
    private javax.swing.JLabel label_ImagePic;
    private javax.swing.JLabel label_YearofGraduation;
    private javax.swing.JLabel label_YourSkills;
    private javax.swing.JLabel label_YourSkills1;
    private javax.swing.JScrollPane scrollpane_SkillList;
    private javax.swing.JScrollPane scrollpane_SkillList1;
    private javax.swing.JTextField textfield_AddSkill;
    private javax.swing.JTextField textfield_CollegeName;
    private javax.swing.JTextField textfield_DegreeMajor;
    private javax.swing.JTextField textfield_FullName;
    // End of variables declaration//GEN-END:variables
}
