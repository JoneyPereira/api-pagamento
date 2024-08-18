DELETE FROM tb_transaction;
DELETE FROM tb_wallets;

INSERT INTO
        tb_wallets (
            id, fullName, cpfCnpj, email, password, type, balance
        )
        VALUES (
            1, 'Pedro - User', '563.816.700-53', 'pedro@user.com', '@Pedro', 1, 1000.00
        );

INSERT INTO
        tb_wallets (
            id, fullName, cpfCnpj, email, password, type, balance
        )
        VALUES (
            2, 'Lucas - Lojista', '81.551.712/0001-09', 'lucas@lojista.com', '@Lucas', 2, 1000.00
        );