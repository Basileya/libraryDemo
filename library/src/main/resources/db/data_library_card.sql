--CREATE TABLE IF NOT EXISTS library_card_data(
--ALTER TABLE library_card_data,
--  id INTEGER NOT NULL,
--  user_id INT UNIQUE NOT NULL,
--  date INTEGER,
--  user_id INTEGER,
--  libraryBase_id INTEGER,
--    FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE,
--    FOREIGN KEY (libraryBase_id) REFERENCES libraryBase(id) ON DELETE CASCADE,
SELECT book_id, `date`, id
FROM library.library_card_data;
insert into library_card_data (id, date, book_id) values
(1, 2019, 1),
(1, 2021, 2),
(1, 2023, 3),