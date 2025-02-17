using UnityEngine;

public class NewMonoBehaviourScript : MonoBehaviour
{
    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {
        Debug.Log("Mensaje de Información");
        Debug.LogWarning("Mensaje de Aviso");
        //Debug.LogError("Mensaje de Error");
    }

    // Update is called once per frame
    void Update()
    {
        Debug.Log("Mensaje de Información");
        Debug.LogWarning("Mensaje de Aviso");
        //Debug.LogError("Mensaje de Error");
    }
}
