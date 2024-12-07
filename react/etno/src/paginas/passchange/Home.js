import React from 'react'

export function Home() {
    return (
        <div className='container-login'>
            <div className='login-form'>
                <h2>Recuperar senha</h2>
                <form method='post'>
                    <input type='email' name='email' required placeholder='Email'></input>
                    <button type='submit'>Recuperar senha</button>
                </form>
            </div>
            <p>Já possui cadastro? <a href='/login'>Faça login</a></p>
        </div>
    )
}
