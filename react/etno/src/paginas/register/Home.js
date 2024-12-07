import React from 'react'

export function Home() {
    return (
        <div className='container-login'>
            <div className='login-form'>
                <h2>Cadastrar</h2>
                <form method='post'>
                    <input type='text' name='nome' required placeholder='Nome'></input>
                    <input type='email' name='email' required placeholder='Email'></input>
                    <input type='password' name='senha' required placeholder='Senha'></input>
                    <input type='password' name='senhaRepetida' required placeholder='Repetir senha'></input>
                    <button type='submit'>Registrar</button>
                </form>
            </div>
            <p>Já possui cadastro? <a href='/login'>Faça login</a></p>
        </div>
    )
}
