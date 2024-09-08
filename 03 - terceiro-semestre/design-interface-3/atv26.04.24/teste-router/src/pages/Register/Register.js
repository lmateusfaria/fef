import React from "react";
import styles from './Register.module.css'

const Register = () => {
    return (
        <>
            <h1>Cadastre-se para postar</h1>
            <form>
                <label>
                    <span>Nome</span>
                    <input type="text" name="displayName" required placeholder="Nome do Usuário"/>
                </label>
                <br/><br/>
                <label>
                    <span>Email</span>
                    <input type="email" name="displayEmail" required placeholder="Email do Usuário"/>
                </label>
                <br/><br/>
                <label>
                    <span>Senha</span>
                    <input type="password" name="displayPassword" required placeholder="Senha do Usuário"/>
                </label>
                <br/><br/>
                <label>
                    <span>Confirmar Senha</span>
                    <input type="password" name="displayPasswordConfirm" required placeholder="Confirmar Senha do Usuário"/>
                </label>
                <br/><br/>
                <button className="btn"> Cadastrar</button>
            </form>
        </>
    )
}

export default Register