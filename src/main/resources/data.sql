INSERT INTO `users` (`username`, `password`, `enabled`) VALUES ('sa1', '$2a$10$U.yM1QWUIxuohOJ/Ijq83u4n8sfZpFgxZE7PcajKjlnJQqydxtD2i', '1');
INSERT INTO `users` (`username`, `password`, `enabled`) VALUES ('sa2', '$2a$10$U.yM1QWUIxuohOJ/Ijq83u4n8sfZpFgxZE7PcajKjlnJQqydxtD2i', '1');

INSERT INTO `roles` (`name`) VALUES ('USER');
INSERT INTO `roles` (`name`) VALUES ('ADMIN');

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES (1, 2); -- sa1 patrick has role ADmin
INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES (2, 1); -- sa2 patrick has role user
