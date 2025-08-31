-- Patient Data
INSERT INTO patient (id, first_name, last_name, age) VALUES (1, 'Michael', 'Scott', 45);
INSERT INTO patient (id, first_name, last_name, age) VALUES (2, 'Pam', 'Beesly', 30);

-- Clinical Data
INSERT INTO clinical_data (id, diagnosis, treatment, patient_id) VALUES (10, 'Hypertension', 'Lifestyle changes and medication', 1);
INSERT INTO clinical_data (id, diagnosis, treatment, patient_id) VALUES (11, 'Diabetes', 'Insulin therapy', 1);
INSERT INTO clinical_data (id, diagnosis, treatment, patient_id) VALUES (12, 'Asthma', 'Inhaler and breathing exercises', 2);
INSERT INTO clinical_data (id, diagnosis, treatment, patient_id) VALUES (13, 'Arthritis', 'Physical therapy and pain management', 2);
INSERT INTO clinical_data (id, diagnosis, treatment, patient_id) VALUES (14, 'Migraine', 'Pain relievers and lifestyle adjustments', 2);