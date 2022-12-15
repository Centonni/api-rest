


@app.route("/notify", methods=["GET"])
def notifier_chargement_fichier():
    # Ap
    loadFile()
    return "Fichier traité avec succès"


@app.route("/launchTests", methods=["POST"]) #un json sera 
def notifier_chargement_fichier():
    content_type = request.headers.get('Content-Type')
    if (content_type == 'application/json'):
        scenario = request.json
        print (scenario)
        LancerTestsScenario(scenario)
        # Stocker & Traiter le test de scenario à faire
    else:
        return 'Content-Type not supported!'


@app.route('/post_json', methods=['POST'])
def process_json():
    content_type = request.headers.get('Content-Type')
    if (content_type == 'application/json'):
        json = request.json
        print (json)
        LancerTestsScenario(json)
    else:
        return 'Content-Type not supported!'

def loadFile():
    # fonction deja existante qui charge le contenu du fichier vers la bd