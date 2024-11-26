import React from 'react';

export function NavMenu() {
    return (
        <div className="nav">
            <p className="hoje">Hoje</p>
            <p className="mes">Novembro de 2024</p>
            <div className="arrows">
                <div>
                    <i className="bi bi-chevron-left"></i>                    
                </div>
                <div>
                    <i className="bi bi-chevron-right"></i>                  
                </div>
            </div>
        </div>
    )
}