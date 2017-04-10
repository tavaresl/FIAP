//
//  ViewController.swift
//  MeusDados Swift
//
//  Created by Lucas Rocha on 01/03/17.
//  Copyright © 2017 Lucas Tavares. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var myNameLabel: UILabel!
    @IBOutlet weak var myAgeLabel: UILabel!
    @IBOutlet weak var myCityLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        // Atualiza o texto das Labels
        myNameLabel.text = "Meu nome é:"
        myAgeLabel.text  = "Minha idade é:"
        myCityLabel.text = "Minha cidade é:"
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


    @IBAction func show(_ sender: Any) {
        // Exibe as informações nas Labels
        myNameLabel.text = "Meu nome é: Lucas"
        myAgeLabel.text  = "Minha idade é: 19"
        myCityLabel.text = "Minha cidade é: São Paulo"
    }
    
    @IBAction func hide(_ sender: Any) {
        // Esconde as informações nas Labels
        myNameLabel.text = "Meu nome é:"
        myAgeLabel.text  = "Minha idade é:"
        myCityLabel.text = "Minha cidade é:"
    }
    
}

