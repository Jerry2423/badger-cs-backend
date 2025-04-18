-- Student users
INSERT INTO users (email, nickname, password, major, type)
VALUES ('student1@university.edu', 'AliceSmith', '123456', 'Computer Science', 'student'),
       ('john.doe@campus.edu', 'JohnDoe2025', 'password1', 'Electrical Engineering', 'student'),
       ('emily.w@school.edu', 'EmilyW', 'emily_pass', 'Business Administration', 'student');

-- Organization accounts
INSERT INTO users (email, nickname, password, major, type)
VALUES ('cs_club@university.edu', 'CSClub', 'club2025', NULL, 'org'),
       ('career.center@campus.edu', 'CareerCenter', 'career123', NULL, 'org'),
       ('sports.team@school.edu', 'SportsTeam', 'team_pass', NULL, 'org');
